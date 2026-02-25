package com.john.table.global.apiPayload.controller;

import com.john.table.global.apiPayload.code.ErrorCode;
import com.john.table.global.config.swagger.ApiErrorCodeExamples;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docs")
@Tag(name = "00. Global Error", description = "서버 전역에서 발생할 수 있는 공통 에러 가이드입니다.")
public class CommonDocsController {

    @GetMapping("/errors")
    @Operation(
            summary = "전역 공통 에러 코드 목록",
            description = "### 에러 처리 안내\n\n"
                    + "**[API별 특수 예외]**: 특정 API에서만 발생하는 비즈니스 로직 예외는 **각 API 상세 페이지 하단의 Responses 섹션**에서 개별적으로 확인하실 수 있습니다.\n\n"
                    + "**[공통 예외 발생]**: 본 섹션에 명시된 에러들은 모든 API 요청 시 별도의 선언 없이도 발생할 수 있으며, 가독성을 위해 개별 API 명세에서는 생략되었습니다.\n\n"
                    + "**[에러 예시 확인 방법]**\n"
                    + "1. 하단의 **Responses** 섹션으로 이동합니다.\n"
                    + "2. 각 상태 코드(400, 404 등) 우측의 **'Examples' 드롭다운**을 클릭합니다.\n"
                    + "3. 확인하고 싶은 특정 에러 코드를 선택하여 응답 본문(Response Body) 구조를 확인합니다.\n\n")
    @ApiErrorCodeExamples({
        ErrorCode.INTERNAL_SERVER_ERROR, // 500
        ErrorCode.BAD_REQUEST, // 400
        ErrorCode.NOT_FOUND, // 404
        ErrorCode.METHOD_NOT_ALLOWED, // 405
        ErrorCode.UNSUPPORTED_MEDIA_TYPE, // 415
        ErrorCode.CONFLICT, // 409
        ErrorCode.FORBIDDEN, // 403
        ErrorCode.INVALID_TYPE_VALUE // 400 (Validation)
    })
    public void getGlobalErrors() {
        // 실제 호출되지 않는 문서용 엔드포인트입니다.
    }
}
