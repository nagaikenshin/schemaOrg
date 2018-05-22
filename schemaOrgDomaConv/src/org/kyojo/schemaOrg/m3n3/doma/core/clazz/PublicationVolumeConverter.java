package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLICATION_VOLUME;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PublicationVolume;

@ExternalDomain
public class PublicationVolumeConverter implements DomainConverter<PublicationVolume, String> {

	@Override
	public String fromDomainToValue(PublicationVolume domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicationVolume fromValueToDomain(String value) {
		return new PUBLICATION_VOLUME(value);
	}

}
