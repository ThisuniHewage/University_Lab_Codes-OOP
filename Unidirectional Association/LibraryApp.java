package Question03;
class Member{
    private String memberName;

    public Member(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }
}

class Library{
    private String libraryName;
    private Member[] members;

    public Library(String libraryName, Member[] members) {
        this.libraryName = libraryName;
        this.members = members;
    }

    public void listMembers(){
        System.out.println("Library: " + libraryName);
        System.out.println("Members: ");
        for(int i = 0; i < members.length; i++){
            System.out.println("-" + members[i].getMemberName());
        }
    }
}


public class LibraryApp {
    public static void main(String[] args) {
        Member member1 = new Member("John");
        Member member2 = new Member("Sarah");
        Member member3 = new Member("Mike");

        Member[] members = {member1, member2, member3};

        Library library = new Library("City Library", members);

        library.listMembers();
    }
}
