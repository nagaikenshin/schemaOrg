package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPEAKABLE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.SpeakableSpecification;

@ExternalDomain
public class SpeakableSpecificationConverter implements DomainConverter<SpeakableSpecification, String> {

	@Override
	public String fromDomainToValue(SpeakableSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpeakableSpecification fromValueToDomain(String value) {
		return new SPEAKABLE_SPECIFICATION(value);
	}

}
