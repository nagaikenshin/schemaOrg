package org.kyojo.schemaorg.m3n4.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.GENITOURINARY;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Genitourinary;

@ExternalDomain
public class GenitourinaryConverter implements DomainConverter<Genitourinary, String> {

	@Override
	public String fromDomainToValue(Genitourinary domain) {
		return domain.getNativeValue();
	}

	@Override
	public Genitourinary fromValueToDomain(String value) {
		return new GENITOURINARY(value);
	}

}
