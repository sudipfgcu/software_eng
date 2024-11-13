public class LibraryMember {
    private String memberId;
    private String name;
    private int borrowedBooksCount;

    public LibraryMember(String memberId, String name, int borrowedBooksCount) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
// This method takes a single parameter, other, of type Object. This is necessary because equals is defined in the Object class, 
//and every class in Java inherits from Object. This allows us to compare LibraryMember instances with any other type of object.
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LibraryMember)) {
            return false;
        }
        LibraryMember that = (LibraryMember) other;
        return this.memberId.equals(that.memberId) &&
               this.name.equals(that.name) &&
               this.borrowedBooksCount == that.borrowedBooksCount;
    }

    public void borrowBook() {
        borrowedBooksCount++;
    }

    public void returnBook() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
        }
    }
}

//---------------------------------------------------------------------------------------------------
// LibraryMember Test
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LibraryMemberTest {
    @Test
    public void testBorrowBook() {
        LibraryMember member = new LibraryMember("M001", "Alice", 2);  // Create member
        member.borrowBook();                                           // Borrow a book
        assertEquals(3, member.getBorrowedBooksCount());               // Check count
    }

    @Test
    public void testReturnBook() {
        LibraryMember member = new LibraryMember("M002", "Bob", 2);
        member.returnBook();                                           // Return a book
        assertEquals(1, member.getBorrowedBooksCount());               // Check count
    }

    @Test
    public void testEquals() {
        LibraryMember member1 = new LibraryMember("M003", "Charlie", 0);
        LibraryMember member2 = new LibraryMember("M003", "Charlie", 0);
        assertTrue(member1.equals(member2));                           // Test for equality
    }
}

