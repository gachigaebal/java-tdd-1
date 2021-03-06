/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void simle() {
        assertEquals(1, 1);
    }

    @Test void addCard() {
        KanbanState state = new KanbanState();
        KanbanApp app = new KanbanApp();
        
        KanbanState state1 = app.addCard(state, "eat food");

        assertEquals(state1.getTodoColumnSize(), 1);
    }

    @Test void progressCard() {
        KanbanState state = new KanbanState();
        KanbanApp app = new KanbanApp();
        KanbanState state1 = app.addCard(state, "eat food");

        KanbanState state2 = app.progressCard(state1, "eat food");

        assertEquals(state2.getInProgressColumnSize(), 1);
        assertNotEquals(state2.getInProgress().indexOf("eat food"), -1);
    }

    @Test void doneCard() {
        KanbanState state = new KanbanState();
        KanbanApp app = new KanbanApp();
        KanbanState state1 = app.addCard(state, "eat food");

        KanbanState state2 = app.progressCard(state1, "eat food");

        KanbanState state3 = app.progressCard(state2, "eat food");
        
        assertEquals(state3.getDoneColumnSize(), 1);
        assertNotEquals(state3.getDone().indexOf("eat food"), -1); 
    }
}
