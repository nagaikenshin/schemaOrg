package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalExam.ABDOMEN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalExam.Abdomen;

@ExternalDomain
public class AbdomenConverter implements DomainConverter<Abdomen, String> {

	@Override
	public String fromDomainToValue(Abdomen domain) {
		return domain.getNativeValue();
	}

	@Override
	public Abdomen fromValueToDomain(String value) {
		return new ABDOMEN(value);
	}

}
