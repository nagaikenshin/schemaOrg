package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.SPEAKABLE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.SpeakableSpecification;

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
