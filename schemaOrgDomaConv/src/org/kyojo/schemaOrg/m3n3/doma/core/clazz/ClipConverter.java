package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CLIP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Clip;

@ExternalDomain
public class ClipConverter implements DomainConverter<Clip, String> {

	@Override
	public String fromDomainToValue(Clip domain) {
		return domain.getNativeValue();
	}

	@Override
	public Clip fromValueToDomain(String value) {
		return new CLIP(value);
	}

}
