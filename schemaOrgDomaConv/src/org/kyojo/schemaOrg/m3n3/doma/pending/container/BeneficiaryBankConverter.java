package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.BENEFICIARY_BANK;
import org.kyojo.schemaOrg.m3n3.pending.Container.BeneficiaryBank;

@ExternalDomain
public class BeneficiaryBankConverter implements DomainConverter<BeneficiaryBank, String> {

	@Override
	public String fromDomainToValue(BeneficiaryBank domain) {
		return domain.getNativeValue();
	}

	@Override
	public BeneficiaryBank fromValueToDomain(String value) {
		return new BENEFICIARY_BANK(value);
	}

}
