package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_LEGAL_STATUS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugLegalStatus;

@ExternalDomain
public class DrugLegalStatusConverter implements DomainConverter<DrugLegalStatus, String> {

	@Override
	public String fromDomainToValue(DrugLegalStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugLegalStatus fromValueToDomain(String value) {
		return new DRUG_LEGAL_STATUS(value);
	}

}