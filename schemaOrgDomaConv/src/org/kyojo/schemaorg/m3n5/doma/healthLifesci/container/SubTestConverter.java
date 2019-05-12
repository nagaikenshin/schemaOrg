package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SUB_TEST;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SubTest;

@ExternalDomain
public class SubTestConverter implements DomainConverter<SubTest, String> {

	@Override
	public String fromDomainToValue(SubTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubTest fromValueToDomain(String value) {
		return new SUB_TEST(value);
	}

}
