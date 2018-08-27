package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RADIO_CLIP;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioClip;

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
