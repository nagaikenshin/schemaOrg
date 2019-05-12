package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.IMAGING_TEST;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ImagingTest;

@ExternalDomain
public class ImagingTestConverter implements DomainConverter<ImagingTest, String> {

	@Override
	public String fromDomainToValue(ImagingTest domain) {
		return domain.getNativeValue();
	}

	@Override
	public ImagingTest fromValueToDomain(String value) {
		return new IMAGING_TEST(value);
	}

}
