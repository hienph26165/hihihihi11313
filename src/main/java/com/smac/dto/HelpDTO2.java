package com.smac.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.smac.entity.Help;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelpDTO2 {
	
	
	private Long helpId;
	
	private String helpName;
	
	private Long parent;
	
	private String type;
	
	private String position;
	
	private String content;
	
	private String createdUser;
	
	private String status;
}
