package de.peterspace.cardanotools.dbsync;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.apache.commons.codec.DecoderException;

import de.peterspace.cardanotools.cardano.CardanoUtil;
import lombok.Data;

@Data
public class TokenData {

	@NotBlank
	private String policyId;

	@NotBlank
	private String name;

	@NotNull
	private Long quantity;

	@NotBlank
	private String txId;

	@NotBlank
	private String json;

	private Long invalid_before;

	private Long invalid_hereafter;

	@NotNull
	private Long blockNo;

	@NotNull
	private Long epochNo;

	@NotNull
	private Long epochSlotNo;

	@NotNull
	private Long tid;

	@NotNull
	private Long mintid;

	@NotNull
	public String getFingerprint() throws DecoderException {
		return CardanoUtil.createAssetFingerprint(policyId, name);
	}
}
