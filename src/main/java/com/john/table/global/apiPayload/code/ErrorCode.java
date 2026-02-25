package com.john.table.global.apiPayload.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode implements BaseErrorCode {
    // Common
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "COMMON400_1", "잘못된 입력 값입니다."),
    INVALID_TYPE_VALUE(HttpStatus.BAD_REQUEST, "COMMON400_2", "유효하지 않은 타입 값입니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "COMMON404_1", "요청한 리소스를 찾을 수 없습니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "COMMON405_1", "허용되지 않은 메서드입니다."),
    CONFLICT(HttpStatus.CONFLICT, "COMMON409_1", "이미 존재하는 리소스이거나 데이터 충돌이 발생했습니다."),
    UNSUPPORTED_MEDIA_TYPE(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "COMMON415_1", "지원하지 않는 미디어 타입(Content-Type)입니다."),
    SWAGGER_ANNOTATION_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON500_1", "Swagger 오류"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON500_1", "예기치 않은 서버 에러가 발생했습니다."),

    // JWT
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "AUTH401_1", "인증이 필요합니다."),
    EXPIRED_JWT(HttpStatus.UNAUTHORIZED, "AUTH401_2", "만료된 JWT 토큰입니다."),
    UNSUPPORTED_JWT(HttpStatus.UNAUTHORIZED, "AUTH401_3", "지원되지 않는 JWT 토큰입니다."),
    SIGNATURE_INVALID_JWT(HttpStatus.UNAUTHORIZED, "AUTH401_4", "유효하지 않은 JWT 시그니처입니다."),
    JWT_NOT_FOUND(HttpStatus.UNAUTHORIZED, "AUTH401_5", "JWT 토큰을 찾을 수 없습니다."),
    AUTHENTICATION_FAILED(HttpStatus.UNAUTHORIZED, "AUTH401_6", "인증에 실패했습니다."),
    FORBIDDEN(HttpStatus.FORBIDDEN, "AUTH403_1", "해당 리소스에 접근할 권한이 없습니다."),

    PAGE_INVALID(HttpStatus.BAD_REQUEST, "PAGE400_1", "유효하지 않은 페이지 범위입니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
