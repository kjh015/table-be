package com.john.table.global.apiPayload.dto;

import lombok.Builder;

/**
 * API 에러 발생 시 세부 필드 에러 정보를 담기 위한 DTO
 * @param field 에러가 발생한 필드명
 * @param value 사용자가 입력한 잘못된 값
 * @param reason 에러가 발생한 구체적인 이유
 */
@Builder
public record ErrorDTO(String field, Object value, String reason) {}
