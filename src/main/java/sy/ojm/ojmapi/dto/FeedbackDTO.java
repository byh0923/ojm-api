package sy.ojm.ojmapi.dto;
public class FeedbackDTO {
    private BasicInfo basicInfo;

    // BasicInfo 내부 클래스
    public static class BasicInfo {
        private Feedback feedback;

        // Feedback 내부 클래스
        public static class Feedback {
            private int allphotocnt;
            private int blogrvwcnt;
            private int comntcnt;
            private int scoresum;
            private int scorecnt;

            // 기본 생성자, getter, setter 생략

            // Getter and Setter
            public int getAllphotocnt() {
                return allphotocnt;
            }

            public void setAllphotocnt(int allphotocnt) {
                this.allphotocnt = allphotocnt;
            }

            public int getBlogrvwcnt() {
                return blogrvwcnt;
            }

            public void setBlogrvwcnt(int blogrvwcnt) {
                this.blogrvwcnt = blogrvwcnt;
            }

            public int getComntcnt() {
                return comntcnt;
            }

            public void setComntcnt(int comntcnt) {
                this.comntcnt = comntcnt;
            }

            public int getScoresum() {
                return scoresum;
            }

            public void setScoresum(int scoresum) {
                this.scoresum = scoresum;
            }

            public int getScorecnt() {
                return scorecnt;
            }

            public void setScorecnt(int scorecnt) {
                this.scorecnt = scorecnt;
            }
        }

        // BasicInfo의 Getter and Setter
        public Feedback getFeedback() {
            return feedback;
        }

        public void setFeedback(Feedback feedback) {
            this.feedback = feedback;
        }
    }

    // FeedbackDTO의 Getter and Setter
    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }
}
