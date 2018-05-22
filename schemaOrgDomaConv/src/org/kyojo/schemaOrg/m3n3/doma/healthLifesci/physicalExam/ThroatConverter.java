package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.THROAT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Throat;

@ExternalDomain
public class ThroatConverter implements DomainConverter<Throat, String> {

	@Override
	public String fromDomainToValue(Throat domain) {
		return domain.getNativeValue();
	}

	@Override
	public Throat fromValueToDomain(String value) {
		return new THROAT(value);
	}

}
