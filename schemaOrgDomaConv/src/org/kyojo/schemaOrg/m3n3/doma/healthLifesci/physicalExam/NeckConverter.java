package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.NECK;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Neck;

@ExternalDomain
public class NeckConverter implements DomainConverter<Neck, String> {

	@Override
	public String fromDomainToValue(Neck domain) {
		return domain.getNativeValue();
	}

	@Override
	public Neck fromValueToDomain(String value) {
		return new NECK(value);
	}

}
