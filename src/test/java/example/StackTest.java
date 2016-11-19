package example;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
    @Test
    public void given_a_stack_when_test_whether_its_empty_then_its_empty() throws Exception {
        Stack<Integer> stack = new Stack<>();

        boolean empty = stack.isEmpty();

        assertTrue(empty);
    }

    @Test
    public void given_an_unempty_stack_when_peek_then_return_the_last_item() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int result = stack.peek();

        assertEquals(3, result);
    }

    @Test
    public void given_an_unempty_stack_when_search_an_existing_item_then_return_its_index() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int result = stack.search(2);

        assertEquals(2, result);
    }
}
