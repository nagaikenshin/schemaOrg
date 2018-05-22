package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PHYSICAL_EXAM;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PhysicalExam;

@ExternalDomain
public class PhysicalExamConverter implements DomainConverter<PhysicalExam, String> {

	@Override
	public String fromDomainToValue(PhysicalExam domain) {
		return domain.getNativeValue();
	}

	@Override
	public PhysicalExam fromValueToDomain(String value) {
		return new PHYSICAL_EXAM(value);
	}

}
