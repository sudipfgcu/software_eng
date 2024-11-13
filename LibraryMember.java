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


