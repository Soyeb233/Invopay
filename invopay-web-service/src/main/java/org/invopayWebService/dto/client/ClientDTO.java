package org.invopayWebService.dto.client;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClientDTO {

	private int client_id;
	private long client_type;
	private String client_fname;
	private String client_lname;
	private String client_name;
	private String client_mobile;
	private String client_email;
	private int archive_status;
	private String supplier_name;

	public ClientDTO(int client_id, long client_type, String client_fname, String client_lname, String client_mobile, String client_email, int archive_status, String supplier_name) {
		this.client_id = client_id;
		this.client_type = client_type;
		this.client_fname = client_fname;
		this.client_lname = client_lname;
		this.client_mobile = client_mobile;
		this.client_email = client_email;
		this.archive_status = archive_status;
		this.supplier_name = supplier_name;
	}
}
