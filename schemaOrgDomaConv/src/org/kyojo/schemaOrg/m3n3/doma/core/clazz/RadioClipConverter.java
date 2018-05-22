package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RADIO_CLIP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RadioClip;

@ExternalDomain
public class RadioClipConverter implements DomainConverter<RadioClip, String> {

	@Override
	public String fromDomainToValue(RadioClip domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadioClip fromValueToDomain(String value) {
		return new RADIO_CLIP(value);
	}

}
