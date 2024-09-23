package skill5;

public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(int id, String name, String course, String thesisTitle) {
        super(id, name, course);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }
}
