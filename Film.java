public class Film {
    private String title;
    private String leadActor;
    private String director;
    private boolean isAwarded;

    public Film(String title, String leadActor, String director, boolean isAwarded) {
        this.title = title;
        this.leadActor = leadActor;
        this.director = director;
        this.isAwarded = isAwarded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isAwarded() {
        return isAwarded;
    }

    public void setAwarded(boolean awarded) {
        isAwarded = awarded;
    }
}
