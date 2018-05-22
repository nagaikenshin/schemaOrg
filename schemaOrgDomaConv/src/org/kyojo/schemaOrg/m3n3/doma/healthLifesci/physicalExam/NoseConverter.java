package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.NOSE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Nose;

@ExternalDomain
public class NoseConverter implements DomainConverter<Nose, String> {

	@Override
	public String fromDomainToValue(Nose domain) {
		return domain.getNativeValue();
	}

	@Override
	public Nose fromValueToDomain(String value) {
		return new NOSE(value);
	}

}
