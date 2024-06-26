package ObjectGson.GsonForServer;

public class SV_Score {
    private int userId;
    private String score;
    private SV_UserInfor sv_userInfor;

    public SV_Score(int userId, String score) {
        this.userId = userId;
        this.score = score;
    }

    public SV_Score() {
    }

    public SV_UserInfor getSv_userInfor() {
        return sv_userInfor;
    }

    public void setSv_userInfor(SV_UserInfor sv_userInfor) {
        this.sv_userInfor = sv_userInfor;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "SV_Score{" +
                "userId=" + userId +
                ", score='" + score + '\'' +
                ", sv_userInfor=" + sv_userInfor +
                '}';
    }
}
