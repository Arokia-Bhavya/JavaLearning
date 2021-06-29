
public enum Error {
PAGE_NOT_FOUND(404,"Page Not found","Client Side"),
INTERNAL_SERVER_ERROR(500,"Internal Server Error","Server Side"),
UNAUTHORIZED(401,"Un Authorized","Client Side");

private int error_code;
public int getError_code() {
	return error_code;
}

public void setError_code(int error_code) {
	this.error_code = error_code;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

private String description;
private String source;

Error(int error_code, String description, String source) {
	this.error_code=error_code;
	this.description=description;
	this.source=source;
}

}
