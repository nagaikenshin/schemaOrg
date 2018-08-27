package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.HOSPITAL_AFFILIATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HospitalAffiliation;

@ExternalDomain
public class HospitalAffiliationConverter implements DomainConverter<HospitalAffiliation, String> {

	@Override
	public String fromDomainToValue(HospitalAffiliation domain) {
		return domain.getNativeValue();
	}

	@Override
	public HospitalAffiliation fromValueToDomain(String value) {
		return new HOSPITAL_AFFILIATION(value);
	}

}
