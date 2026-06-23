# docs/

Generated, browsable artifacts — **not** part of the blank workbook you fill in.

## lectures/

When you learn a topic (`/teach <topic>`, the `teach_topic` MCP tool, or just
"teach me X"), the agent archives the lecture it gave you to
`docs/lectures/<module>/<topic>.md` so you can re-read it later. Re-teaching a
topic replaces its file.

These archives are auto-generated and personal to your sessions, so they're
git-ignored — they won't clutter the workbook or show up in your commits. Delete
`docs/lectures/` anytime; it rebuilds as you learn.
