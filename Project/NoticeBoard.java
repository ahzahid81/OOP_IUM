package Project;

// Abdul Hasib Zahid
//443058333

class NoticeBoard {
    private String boardId;
    private String[] notices;

    public NoticeBoard(String boardId, String[] notices) {
        this.boardId = boardId;
        this.notices = notices;
    }

    public void displayNotices() {
        System.out.println("Notice Board ID: " + boardId);
        System.out.println("Notices:");
        for (String notice : notices) {
            System.out.println("- " + notice);
        }
    }

    public void addNotice(String newNotice) {
        String[] updatedNotices = new String[notices.length + 1];
        System.arraycopy(notices, 0, updatedNotices, 0, notices.length);
        updatedNotices[notices.length] = newNotice;
        this.notices = updatedNotices;
    }
}
