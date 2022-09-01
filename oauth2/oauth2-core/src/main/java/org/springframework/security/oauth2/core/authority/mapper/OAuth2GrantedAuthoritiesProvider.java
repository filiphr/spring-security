package org.springframework.security.oauth2.core.authority.mapper;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

/**
 * @author Filip Hrisafov
 */
public interface OAuth2GrantedAuthoritiesProvider {

	Collection<? extends GrantedAuthority> extractAuthorities(OAuth2User oAuth2User);
}
