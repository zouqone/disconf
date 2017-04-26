package com.baidu.dsp.common.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.baidu.ub.common.commons.ThreadContext;

/**
 * JSON 基类
 *
 * @author liaoqiqi
 * @version 2013-12-3
 */
public class JsonObjectBase implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8441731449894560959L;

    /**
     * 如果成功的话，数据结果
     */
    protected Map<String, Object> message = new HashMap<String, Object>();

    public JsonObjectBase() {
        sessionId = ThreadContext.getSessionId();
    }

    /**
     * 会话ID
     */
    private String sessionId = "";

    protected String success = "true";

    private Map<String, Object> result = new HashMap<String, Object>();
    
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getSessionId() {
        return sessionId;
    }

    public Map<String, Object> getMessage() {
        return message;
    }

    public void setMessage(Map<String, Object> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "JsonObjectBase [message=" + message + ", sessionId=" + sessionId + ", success=" + success + "]";
    }

	public void addData(String key, Object value) {
		result.put(key, value);
		
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	
	

}
