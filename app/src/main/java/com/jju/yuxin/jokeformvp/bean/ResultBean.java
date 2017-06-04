package com.jju.yuxin.jokeformvp.bean;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp.bean
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 9:36.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public class ResultBean {

        /**
         * content :
         * hashId : 39F1B309144E7C378118EA1A66C569A2
         * unixtime : 1494385240
         * updatetime : 2017-05-10 11:00:40
         */

        private String content;
        private String hashId;
        private String unixtime;
        private String updatetime;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getHashId() {
            return hashId;
        }

        public void setHashId(String hashId) {
            this.hashId = hashId;
        }

        public String getUnixtime() {
            return unixtime;
        }

        public void setUnixtime(String unixtime) {
            this.unixtime = unixtime;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

    @Override
    public String toString() {
        return "ResultBean{" +
                "content='" + content + '\'' +
                ", hashId='" + hashId + '\'' +
                ", unixtime='" + unixtime + '\'' +
                ", updatetime='" + updatetime + '\'' +
                '}';
    }
}
