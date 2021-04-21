package com.bootcamp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
	public Employee(int i, String string) {
		id = i;
		name = string;
	}
	public int id;
	public String name;
}
