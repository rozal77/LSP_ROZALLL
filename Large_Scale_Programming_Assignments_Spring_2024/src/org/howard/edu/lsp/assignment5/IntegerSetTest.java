package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("IntegerSet Test")
public class IntegerSetTest {
    
    private IntegerSet integerSet;
    
    @BeforeEach
    public void setUp() {
        integerSet = new IntegerSet();
    }
    
    @Test
    @DisplayName("Clear Test")
    public void testClear() {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        integerSet.clear();
        
        assertTrue(integerSet.isEmpty());
    }
    
    @Test
    @DisplayName("Length Test")
    public void testLength() {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        assertEquals(3, integerSet.length());
    }
    
    @Test
    @DisplayName("Contains Test")
    public void testContains() {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        assertTrue(integerSet.contains(5));
        assertFalse(integerSet.contains(7));
    }
    
    
    @Test
    @DisplayName("Add Elements Test")
    public void testAddElements() {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        assertEquals("[5, 10, 3]", integerSet.toString());
    }
    
    @Test
    @DisplayName("isEmpty Test")
    public void testIsEmpty() {
        assertTrue(integerSet.isEmpty());
        integerSet.add(5);
        assertFalse(integerSet.isEmpty());
    }

    @Test
    @DisplayName("toString Test")
    public void testToString() {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        assertEquals("[5, 10, 3]", integerSet.toString());
    }

    
    @Test
    @DisplayName("Remove Elements Test")
    public void testRemoveElements() {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        integerSet.remove(10);
        
        assertEquals("[5, 3]", integerSet.toString());
    }
    
    @Test
    @DisplayName("Non-Empty Set Largest Test")
    public void testNonEmptySetLargest() throws IntegerSetException {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        assertEquals(10, integerSet.largest());
    }
    
    @Test
    @DisplayName("Empty Set Largest Test")
    public void testEmptySetLargest() {
        assertThrows(IntegerSetException.class, () -> {
            integerSet.largest();
        });
    }
 

    @Test
    @DisplayName("Non-Empty Set Smallest Test")
    public void testNonEmptySetSmallest() throws IntegerSetException {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        assertEquals(3, integerSet.smallest());
    }
    
    
    @Test
    @DisplayName("Empty Set Smallest Test")
    public void testEmptySetSmallest() {
        assertThrows(IntegerSetException.class, () -> {
            integerSet.smallest();
        });
    }

    
    @Test
    @DisplayName("Union Test")
    public void testUnion() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(7);
        otherSet.add(3);
        otherSet.add(12);
        
        integerSet.add(5);
        integerSet.add(10);
        
        integerSet.union(otherSet);
        
        assertEquals("[5, 10, 7, 3, 12]", integerSet.toString());
    }
    
    @Test
    @DisplayName("Intersection Test")
    public void testIntersection() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(7);
        otherSet.add(3);
        otherSet.add(12);
        
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        integerSet.intersect(otherSet);
        
        assertEquals("[3]", integerSet.toString());
    }
    
    @Test
    @DisplayName("Difference Test")
    public void testDifference() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(7);
        otherSet.add(3);
        otherSet.add(12);
        
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        integerSet.diff(otherSet);
        
        assertEquals("[5, 10]", integerSet.toString());
    }
    
    @Test
    @DisplayName("Complement Test")
    public void testComplement() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(7);
        otherSet.add(3);
        otherSet.add(12);
        
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(3);
        
        integerSet.complement(otherSet);
        
        assertEquals("[7, 12]", integerSet.toString());
    }
}
