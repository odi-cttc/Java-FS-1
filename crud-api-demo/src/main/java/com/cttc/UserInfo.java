package com.cttc;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class UserInfo {
	private String creUser;
	private String modUser;
}
