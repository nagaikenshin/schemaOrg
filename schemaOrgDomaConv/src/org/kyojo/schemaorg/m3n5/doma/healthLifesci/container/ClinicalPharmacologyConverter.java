package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.CLINICAL_PHARMACOLOGY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ClinicalPharmacology;

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
