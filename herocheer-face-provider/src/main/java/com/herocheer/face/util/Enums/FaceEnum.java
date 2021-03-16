package com.herocheer.face.util.Enums;

/**
 * @author chenwf
 * @date 2020/6/16
 */
public enum FaceEnum {
    first_success("10", "ok"),
    first_error5("15", "DN或保留数据无效"),
    first_error6("16", "参数错误"),
    first_error7("17", "系统错误"),
    first_error9("19", "平台公安接口访问次数用尽"),
    first_errorA("1A", "穿网调用超时"),
    first_errorE("1E", "公安调用接口超时"),
    first_errorX("1X", "未执行"),

    second_success("20", "ok"),
    second_error1("21", "非同一人(人像加密)"),
    second_error2("22", "疑似(人像加密)"),
    second_errorA("2A", "数据库操作错误"),
    second_errorB("2B", "人像对比异常"),
    second_errorC("2C", "输入参数错误"),
    second_errorD("2D", "DN未查到"),
    second_errorE("2E", "图像格式不支持"),
    second_errorF("2F", "待比对图像建模失败"),
    second_errorG("2G", "身份证照片模板不存在"),
    second_errorH("2H", "活体检测控件版本过期"),
    second_errorI("2I", "活体检测数据校验失败"),
    second_errorJ("2J", "现场照片小于5k字节"),
    second_errorK("2K", "公安制证照片或人口照片小于5k字节"),
    second_errorT("2T", "人像引擎超时"),
    second_errorW("2W", "系统其它错误"),
    second_errorX("2X", "未执行");

    private String code;
    private String msg;

    FaceEnum(String code,String msg){
        this.code = code;
        this.msg = msg;

    }
    public static String getMsg(String code) {
        FaceEnum[] list = FaceEnum.values();
        for (FaceEnum faceEnum : list) {
            if (faceEnum.getCode().equals(code)) {
                return faceEnum.getMsg();
            }
        }
        return "未执行";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
