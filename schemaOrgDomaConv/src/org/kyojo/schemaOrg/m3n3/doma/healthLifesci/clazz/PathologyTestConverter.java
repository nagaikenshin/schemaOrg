package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PATHOLOGY_TEST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PathologyTest;

@ExternalDomain
public class PathologyTestConverter implements DomainConverter<PathologyTest, String> {

	@Override
	public String fromDomainToValue(PathologyTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public PathologyTest fromValueToDomain(String value) {
		return new PATHOLOGY_TEST(value);
	}

}
