package com.metrix.util;

public class ResultData {
    private int code;
    private String msg;
    private Object data;
    private long count;
    public static ResultData ok(){
        ResultData resultData = new ResultData();
        resultData.setCode(0);
        resultData.setMsg("成功");
        return resultData;
    }

    public static ResultData ok(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(0);
        resultData.setMsg("成功");
        resultData.setData(data);
        return resultData;
    }
    public static ResultData ok(Object data, long count){
        ResultData resultData = new ResultData();
        resultData.setCode(0);
        resultData.setMsg("成功");
        resultData.setCount(count);
        resultData.setData(data);
        return resultData;
    }
    public static ResultData fail(){
        ResultData resultData = new ResultData();
        resultData.setCode(-1);
        resultData.setMsg("失败");
        return resultData;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
