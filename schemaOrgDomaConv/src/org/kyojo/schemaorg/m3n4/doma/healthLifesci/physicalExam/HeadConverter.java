package org.kyojo.schemaorg.m3n4.doma.healthLifesci.physicalExam;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.HEAD;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Head;

@ExternalDomain
public class HeadConverter implements DomainConverter<Head, String> {

	@Override
	public String fromDomainToValue(Head domain) {
		return domain.getNativeValue();
	}

	@Override
	public Head fromValueToDomain(String value) {
		return new HEAD(value);
	}

}