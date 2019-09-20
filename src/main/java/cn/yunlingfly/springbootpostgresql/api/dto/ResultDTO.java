package cn.yunlingfly.springbootpostgresql.api.dto;

import lombok.Data;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 *   接口返回数据格式
 * @author scott
 * @email jeecgos@163.com
 * @date  2019年1月19日
 */
@Data
public class ResultDTO<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 成功标志
	 */
	private boolean success = true;

	/**
	 * 返回处理消息
	 */
	private String message = "操作成功！";

	/**
	 * 返回代码
	 */
	private Integer code = 0;

	/**
	 * 返回tokn
	 */
	private String token;

	/**
	 * 返回数据对象 data
	 */
	private T result;

	/**
	 * 时间戳
	 */
	private long timestamp = System.currentTimeMillis();

	public ResultDTO() {
		
	}
	
	public ResultDTO<T> error500(String message) {
		this.message = message;
		this.code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
		this.success = false;
		return this;
	}
	
	public ResultDTO<T> success(String message) {
		this.message = message;
		this.code = HttpServletResponse.SC_OK;
		this.success = true;
		return this;
	}
	
	
	public static ResultDTO<Object> ok() {
		ResultDTO<Object> r = new ResultDTO<Object>();
		r.setSuccess(true);
		r.setCode(HttpServletResponse.SC_OK);
		r.setMessage("成功");
		return r;
	}
	
	public static ResultDTO<Object> ok(String msg) {
		ResultDTO<Object> r = new ResultDTO<Object>();
		r.setSuccess(true);
		r.setCode(HttpServletResponse.SC_OK);
		r.setMessage(msg);
		return r;
	}
	
	public static ResultDTO<Object> ok(Object data) {
		ResultDTO<Object> r = new ResultDTO<Object>();
		r.setSuccess(true);
		r.setCode(HttpServletResponse.SC_OK);
		r.setResult(data);
		return r;
	}
	
	public static ResultDTO<Object> error(String msg) {
		return error(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, msg);
	}
	
	public static ResultDTO<Object> error(int code, String msg) {
		ResultDTO<Object> r = new ResultDTO<Object>();
		r.setCode(code);
		r.setMessage(msg);
		r.setSuccess(false);
		return r;
	}
	
	/**
	 * 无权限访问返回结果
	 */
	public static ResultDTO<Object> noauth(String msg) {
		return error(HttpServletResponse.SC_CONFLICT, msg);
	}
}