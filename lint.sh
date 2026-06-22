#!/usr/bin/env bash
#
# Runs editorconfig-checker over the repo — the same lint the CI `lint` job runs.
# The checker binary is fetched on first use into build/tools/ (gitignored).
#
#   ./lint.sh            (or:  ./gradlew lint)
#
set -e
cd "$(dirname "$0")"

VER=3.0.3
OS=$(uname -s | tr '[:upper:]' '[:lower:]')
ARCH=$(uname -m)
[ "$ARCH" = "x86_64" ] && ARCH=amd64
[ "$ARCH" = "aarch64" ] && ARCH=arm64
BIN="build/tools/ec"

if [ ! -x "$BIN" ]; then
  echo "Fetching editorconfig-checker v$VER ..."
  mkdir -p build/tools
  curl -fsSL "https://github.com/editorconfig-checker/editorconfig-checker/releases/download/v${VER}/ec-${OS}-${ARCH}.tar.gz" \
    | tar -xz -C build/tools
  mv "build/tools/bin/ec-${OS}-${ARCH}" "$BIN"
  rmdir build/tools/bin 2>/dev/null || true
fi

exec "$BIN" --config .editorconfig-checker.json
