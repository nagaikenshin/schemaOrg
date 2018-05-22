package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.CLINICAL_PHARMACOLOGY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ClinicalPharmacology;

@ExternalDomain
public class ClinicalPharmacologyConverter implements DomainConverter<ClinicalPharmacology, String> {

	@Override
	public String fromDomainToValue(ClinicalPharmacology domain) {
		return domain.getNativeValue();
	}

	@Override
	public ClinicalPharmacology fromValueToDomain(String value) {
		return new CLINICAL_PHARMACOLOGY(value);
	}

}
