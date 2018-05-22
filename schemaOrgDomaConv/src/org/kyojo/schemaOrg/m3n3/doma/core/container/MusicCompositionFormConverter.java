package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_COMPOSITION_FORM;
import org.kyojo.schemaOrg.m3n3.core.Container.MusicCompositionForm;

@ExternalDomain
public class MusicCompositionFormConverter implements DomainConverter<MusicCompositionForm, String> {

	@Override
	public String fromDomainToValue(MusicCompositionForm domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicCompositionForm fromValueToDomain(String value) {
		return new MUSIC_COMPOSITION_FORM(value);
	}

}
