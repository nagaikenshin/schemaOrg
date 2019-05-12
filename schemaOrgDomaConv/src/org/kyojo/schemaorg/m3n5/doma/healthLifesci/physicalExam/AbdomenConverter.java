package org.kyojo.schemaorg.m3n5.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.ABDOMEN;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.Abdomen;

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
