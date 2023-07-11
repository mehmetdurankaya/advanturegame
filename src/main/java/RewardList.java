public class RewardList {
    private String awardName;

    public RewardList(String awardName){
        this.awardName = awardName;
    }

    public static RewardList[] awarded(String awardName){
        RewardList[] rewardList = new RewardList[3];
        rewardList[0] = new RewardList(null);
        rewardList[1] = new RewardList(null);
        rewardList[2] = new RewardList(null);
        return rewardList;
    }


    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}