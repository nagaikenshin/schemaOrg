package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.EYE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Eye;

@ExternalDomain
public class EyeConverter implements DomainConverter<Eye, String> {

	@Override
	public String fromDomainToValue(Eye domain) {
		return domain.getNativeValue();
	}

	@Override
	public Eye fromValueToDomain(String value) {
		return new EYE(value);
	}

}
