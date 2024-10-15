package org.invopayWebService.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuOrderDTO {
    private Integer menuId;
    private String menuName;
    private Integer sortOrder;
}
