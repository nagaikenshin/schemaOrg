package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SCREENSHOT;
import org.kyojo.schemaorg.m3n4.core.Container.Screenshot;

@ExternalDomain
public class ScreenshotConverter implements DomainConverter<Screenshot, String> {

	@Override
	public String fromDomainToValue(Screenshot domain) {
		return domain.getNativeValue();
	}

	@Override
	public Screenshot fromValueToDomain(String value) {
		return new SCREENSHOT(value);
	}

}
