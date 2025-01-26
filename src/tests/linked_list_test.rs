#[cfg(test)]
mod linked_list_test {
    use crate::data_structures::linked_list::LinkedList;

    #[test]
    fn test_linked_list_creation() {
        let list: LinkedList<i32> = LinkedList::new();
        assert!(list.is_empty());
    }

    #[test]
    fn test_push_front() {
        let mut list: LinkedList<i32> = LinkedList::new();
        list.push_front(10);
        list.push_front(20);
        assert!(!list.is_empty());
        assert_eq!(list.pop_front(), Some(20));
        assert_eq!(list.pop_front(), Some(10));
    }

    #[test]
    fn test_pop_front_empty_list() {
        let mut list: LinkedList<i32> = LinkedList::new();
        assert_eq!(list.pop_front(), None);
    }

    #[test]
    fn test_is_empty() {
        let mut list: LinkedList<i32> = LinkedList::new();
        assert!(list.is_empty());
        list.push_front(30);
        assert!(!list.is_empty());
    }

    #[test]
    fn test_multiple_operations() {
        let mut list: LinkedList<i32> = LinkedList::new();
        list.push_front(1);
        list.push_front(2);
        list.push_front(3);
        assert_eq!(list.pop_front(), Some(3));
        assert_eq!(list.pop_front(), Some(2));
        assert_eq!(list.pop_front(), Some(1));
        assert!(list.is_empty());
    }
}
